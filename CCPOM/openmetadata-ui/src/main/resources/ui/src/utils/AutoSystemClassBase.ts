/*
 *  Copyright 2023 Collate.
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
import { PAGE_SIZE } from '../constants/constants';
import { SearchIndex } from '../enums/search.enum';
import { Paging } from '../generated/type/paging';
import { searchQuery } from '../rest/searchAPI';

class AutoSystemClassBase {
  public async getAutoSystems(searchText: string, page: number) {
    const res = await searchQuery({
      query: `*${searchText}*`,
      filters: 'disabled:false',
      pageNumber: page,
      pageSize: PAGE_SIZE,
      queryFilter: {},
      searchIndex: SearchIndex.AUTOSYSTEM,
    });

    return {
      data: res.hits.hits.map(({ _source }) => ({
        label: _source.fullyQualifiedName ?? '',
        value: _source.fullyQualifiedName ?? '',
        data: _source,
      })),
      paging: {
        total: res.hits.total.value,
      },
    };
  }

}

export const fetchAutoSystemsForConsumer = async (
  searchQueryParam: string,
  page: number
): Promise<{
  data: {
    label: string;
    value: string;
  }[];
  paging: Paging;
}> => {
  const response = await searchQuery({
    query: searchQueryParam ? `*${searchQueryParam}*` : '*',
    pageNumber: page,
    pageSize: 10,
    queryFilter: {},
    searchIndex: SearchIndex.AUTOSYSTEM,
  });
  console.log('searchsearchsearch');
  console.log(response.hits.hits);

  const hits = response.hits.hits;

  return {
    data: hits.map(({ _source }) => ({
      label: _source.name ? _source.name+(_source.shortName ? ' ('+_source.shortName+')' : '') : '',
      value: _source.name ? _source.name+(_source.shortName ? ' ('+_source.shortName+')' : '') : '',
      data: _source,
    })),
    paging: {
      total: response.hits.total.value,
    },
  };
};

export const fetchAutoSystemsForMemberName = async (
  searchQueryParam: string,
  page: number
): Promise<{
  data: {
    label: string;
    value: string;
  }[];
  paging: Paging;
}> => {
  const response = await searchQuery({
    query: searchQueryParam ? `*${searchQueryParam}*` : '*',
    pageNumber: page,
    pageSize: 10,
    queryFilter: {},
    searchIndex: SearchIndex.AUTOSYSTEM,
  });
  console.log('searchsearchsearch');
  console.log(response.hits.hits);

  const hits = response.hits.hits;

  return {
    data: hits.map(({ _source }) => ({
      label: _source.name ? _source.name : '',
      value: _source.name ? _source.name : '',
      data: _source,
    })),
    paging: {
      total: response.hits.total.value,
    },
  };
};

const autoSystemClassBase = new AutoSystemClassBase();

export default autoSystemClassBase;
export { AutoSystemClassBase };
